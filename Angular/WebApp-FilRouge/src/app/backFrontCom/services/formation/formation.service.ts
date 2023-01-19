import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { BehaviorSubject, catchError, map, Observable, Subject, throwError } from 'rxjs';
import { Formation } from '../../classes/formation';
import { DTOFormation } from '../../DTO/dtoformation';

@Injectable({
  providedIn: 'root'
})
export class FormationService {
  private baseUrl="http://localhost:8080/formation-controller";
  formations$ = new BehaviorSubject<DTOFormation[]>([]);
  formationsReady$ = new Subject<void>();


  constructor(private httpClient: HttpClient, private router: Router) {
    this.getFormations();
  }


  public findAll(): Observable<Formation[]> {
    return this.httpClient.get<Formation[]>(this.baseUrl+"/formations");
  }

  public createFormation(form: DTOFormation) {
    console.log(form);
    this.httpClient.post<DTOFormation>(this.baseUrl+"/createFormation", form);
  }

  createForma(formaToCreate: DTOFormation): void {
    console.log("toto: "+formaToCreate)
    this.httpClient.post(this.baseUrl, formaToCreate).subscribe(() => {
      this.getFormations();
      this.router.navigate(['createFormation']);
    });
  }

  getFormations(): void {
    this.httpClient
      .get(this.baseUrl+"/formations")
      .pipe(
        map((res: any) => {
          const formas: DTOFormation[] = [];

          for (const key in res) {
            const forma: DTOFormation = {
              name: res[key].name,
              description: res[key].description,
              themeId: res[key].themeId,
              sousThemesId: res[key].sousThemesId,
              ssThemesId: res[key].ssThemesId,
            };
            formas.push(forma);
          }

          return formas;
        })
      )
      .subscribe((res: DTOFormation[]) => {
        this.formations$.next(res);
        this.formationsReady$.next();
      });
  }

}



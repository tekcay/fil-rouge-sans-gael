import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { catchError, Observable, throwError } from 'rxjs';
import { Formation } from '../../classes/formation';

@Injectable({
  providedIn: 'root'
})
export class FormationService {
  private baseUrl="http://localhost:8080/formation-controller";

  constructor(private httpClient: HttpClient) {console.log(this.formationList.subscribe())}

  get formationList(): Observable<Formation[]>{
    return this.httpClient.get<Formation[]>(this.baseUrl+"/formations").pipe(catchError(this.handleError));
  }

 private handleError = (error: Response) => {
    if (error.status === 400) {return throwError("Bad input error");}
    if (error.status === 404) {return throwError("Not found error");}
    return throwError("App error");
  }

  public findAll(): Observable<Formation[]> {
    return this.httpClient.get<Formation[]>(this.baseUrl+"/formations");
  }


}


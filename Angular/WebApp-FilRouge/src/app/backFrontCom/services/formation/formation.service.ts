import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { catchError, Observable, throwError } from 'rxjs';
import { Formation } from '../../classes/formation';
import { DTOFormation } from '../../DTO/dtoformation';

@Injectable({
  providedIn: 'root'
})
export class FormationService {
  private baseUrl="http://localhost:8080/formation-controller";

  constructor(private httpClient: HttpClient) {}


  public findAll(): Observable<Formation[]> {
    return this.httpClient.get<Formation[]>(this.baseUrl+"/formations");
  }

  public createFormation(form: DTOFormation) {
    console.log(form);
    this.httpClient.post<DTOFormation>(this.baseUrl+"/createFormation", form);
  }
}



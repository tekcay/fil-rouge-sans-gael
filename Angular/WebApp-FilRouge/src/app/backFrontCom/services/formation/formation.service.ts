import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { catchError, Observable, throwError } from 'rxjs';
import { Formation } from '../../classes/formation';

@Injectable({
  providedIn: 'root'
})
export class FormationService {
  private baseUrl="";
  constructor(private httpClient: HttpClient) { }
  get FormationList(): Observable<Formation[]>{
    return this.httpClient.get<Formation[]>(this.baseUrl).pipe(
      catchError(this.handleError)
    );
  }

 private handleError = (error: Response) => {
    if (error.status === 400) {
      return throwError("Bad input error");
    }
    if (error.status === 404) {
      return throwError("Not found error");
    }

    return throwError("App error");
  }
}



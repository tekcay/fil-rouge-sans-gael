import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { catchError, Observable, throwError } from 'rxjs';
import { Sstheme } from '../../classes/sstheme';

@Injectable({
  providedIn: 'root'
})
export class SsThemeService {
  private baseUrl="";
  constructor(private httpClient: HttpClient) { }
  get FormationList(): Observable<Sstheme[]>{
    return this.httpClient.get<Sstheme[]>(this.baseUrl).pipe(
      catchError(this.handleError)
    );
  }

 private handleError = (error: Response) => {
    if (error.status === 400) {
      return throwError("Bad input error");
    }
    if (error.status === 404) {
      return throwError("Not found error"));
    }

    return throwError("App error");
  }
}

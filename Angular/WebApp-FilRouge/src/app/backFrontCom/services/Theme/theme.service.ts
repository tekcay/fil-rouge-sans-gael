import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { catchError, Observable, throwError } from 'rxjs';
import { Theme } from '../../classes/theme';

@Injectable({
  providedIn: 'root'
})
export class ThemeService {
  private baseUrl="http://localhost:8080/theme-controller";
  constructor(private httpClient: HttpClient) { }
  get FormationList(): Observable<Theme[]>{
    return this.httpClient.get<Theme[]>(this.baseUrl).pipe(
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

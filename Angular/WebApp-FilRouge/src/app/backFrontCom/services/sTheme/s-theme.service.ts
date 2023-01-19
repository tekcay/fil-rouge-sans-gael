import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { catchError, Observable, throwError } from 'rxjs';
import { Stheme } from '../../classes/stheme';

@Injectable({
  providedIn: 'root'
})
export class SThemeService {
  private baseUrl="http://localhost:8080/stheme-controller";
  constructor(private httpClient: HttpClient) { }
  get FormationList(): Observable<Stheme[]>{
    return this.httpClient.get<Stheme[]>(this.baseUrl).pipe(
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

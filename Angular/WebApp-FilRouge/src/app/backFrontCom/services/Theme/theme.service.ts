import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Theme } from '../../classes/theme';

@Injectable({
  providedIn: 'root'
})
export class ThemeService {
  private baseUrl="";
  constructor(private httpClient: HttpClient) { }
  get FormationList(): Observable<Theme[]>{
    return this.httpClient.get<Theme[]>(this.baseUrl).pipe(
      catchError(this.handleError)
    );
  }

 private handleError = (error: Response) => {
    if (error.status === 400) {
      return new Error("Bad input error");
    }
    if (error.status === 404) {
      return new Error("Not found error"));
    }

    return new Error("App error");
  }
}

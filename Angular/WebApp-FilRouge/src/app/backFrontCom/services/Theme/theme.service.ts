import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { catchError, Observable, throwError } from 'rxjs';
import { Theme } from '../../classes/theme';

@Injectable({
  providedIn: 'root'
})
export class ThemeService {

  private baseUrl="http://localhost:8080/theme-controller";

  constructor(private httpClient: HttpClient) {

   }

  public findAll(): Observable<Theme[]> {
    return this.httpClient.get<Theme[]>(this.baseUrl+"/themes");
  }

  public findById(id: number): Observable<Theme> {
    return this.httpClient.get<Theme>(this.baseUrl+"/themes/" + id);
  }

}

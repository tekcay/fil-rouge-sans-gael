import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { catchError, Observable, throwError } from 'rxjs';
import { Stheme } from '../../classes/stheme';

@Injectable({
  providedIn: 'root'
})
export class SThemeService {

  private baseUrl="http://localhost:8080/stheme-controller";

  constructor(private httpClient: HttpClient) {

   }

  public findAll(): Observable<Stheme[]> {
    return this.httpClient.get<Stheme[]>(this.baseUrl+"/sthemes");
  }

  public findById(id: number): Observable<Stheme> {
    return this.httpClient.get<Stheme>(this.baseUrl+"/getById/" + id);
  }

}

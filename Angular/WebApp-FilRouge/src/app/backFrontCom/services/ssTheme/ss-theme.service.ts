import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { catchError, Observable, throwError } from 'rxjs';
import { Sstheme } from '../../classes/sstheme';

@Injectable({
  providedIn: 'root'
})
export class SsThemeService {

  private baseUrl="http://localhost:8080/sstheme-controller";

  constructor(private httpClient: HttpClient) {

   }


  public findAll(): Observable<Sstheme[]> {
    return this.httpClient.get<Sstheme[]>(this.baseUrl+"/ssthemes");
  }

  public findById(id: number): Observable<Sstheme> {
    return this.httpClient.get<Sstheme>(this.baseUrl+"/getById/" + id);
  }


}

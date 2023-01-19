import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class SharedService {
  private roleSource: BehaviorSubject<string> = new BehaviorSubject('');
  public role = this.roleSource.asObservable();

  public setRole(value:string){
    this.roleSource.next(value);
  }

  public getRole(){
    return this.roleSource.getValue()
  }

}

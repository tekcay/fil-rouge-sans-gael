import { Component } from '@angular/core';
import { Formation } from 'src/app/backFrontCom/classes/formation';
import { FormateurService } from 'src/app/backFrontCom/services/formateur/formateur.service';
import { FormationService } from 'src/app/backFrontCom/services/formation/formation.service';
import { IFormation } from 'src/app/interfaces/formation';

@Component({
  selector: 'app-list-forma',
  templateUrl: './list-forma.component.html',
  styleUrls: ['./list-forma.component.scss']
})
export class ListFormaComponent {
    formations : Formation[] =[];
    formation : Formation = undefined!;
    constructor(private formationService:FormationService){}

    ngOnInit():void {
      this.formationService.findAll().subscribe(data=>{this.formations=data});
    }

}

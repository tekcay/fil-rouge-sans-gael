import { Component } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Formation } from 'src/app/backFrontCom/classes/formation';
import { DTOFormation } from 'src/app/backFrontCom/DTO/dtoformation';
import { FormationService } from 'src/app/backFrontCom/services/formation/formation.service';

@Component({
  selector: 'app-cards-tab-bord',
  templateUrl: './cards-tab-bord.component.html',
  styleUrls: ['./cards-tab-bord.component.scss']
})
export class CardsTabBordComponent {
  private cache: number[] =[];

    constructor(private fb: FormBuilder,private formationService:FormationService){}

    ngOnInit():void {
      this.cache.push(1)
      console.log(this.cache)
    }

    formationForm: FormGroup = this.fb.group({
      name:'',
      description:'',
      themeId: 0,
      sousThemesId: [],
      ssThemesId: []
    })

    onSubmit() {
      var formDTO: DTOFormation = new DTOFormation(this.formationForm.value.name,this.formationForm.value.description,this.formationForm.value.themeId,[1],[1]);
      this.formationService.createForma(formDTO);
    }

}

import { Component } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Formation } from 'src/app/backFrontCom/classes/formation';
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
      this.formationService.createForma(this.formationForm.value);
    }

}

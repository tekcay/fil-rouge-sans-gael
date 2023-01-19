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

    constructor(private fb: FormBuilder,private formationService:FormationService){}

    ngOnInit():void {
    }

    formationForm: FormGroup = this.fb.group({
      id:2,
      name:'',
      link:'',
      prix:0,
      description:'',
      formateurId: 0,
      isConfirmed: false,
      minParticipants: 10,
      isPerso: false,
      isInterEntreprise: false,
      themeId: 1,
      sousThemesId: [1],
      ssThemesId: [1],
    })

    onSubmit() {
      this.formationService.createFormation(this.formationForm.value);
    }

}

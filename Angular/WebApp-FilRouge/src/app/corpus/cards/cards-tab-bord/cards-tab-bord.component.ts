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
      name:'',
      description:'',
      themeId: 1
    })

    onSubmit() {
      this.formationService.createForma(this.formationForm.value);
    }

}

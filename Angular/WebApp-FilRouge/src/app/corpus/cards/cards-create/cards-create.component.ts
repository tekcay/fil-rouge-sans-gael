import { Component } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
@Component({
  selector: 'app-cards-create',
  templateUrl: './cards-create.component.html',
  styleUrls: ['./cards-create.component.scss']
})
export class CardsCreateComponent {
  formation: FormGroup = this.fb.group({
    id:'0',
    theme:undefined!,
    stheme:undefined!,
    sstheme:undefined!,
    seances:undefined!,
    formateurs:undefined!,
    isConfirmed:false,
    isPerso:false,
    isIntra:false,
    minPart:0,
    nbPart:0,
    link:'',
    price:0,
  })

  constructor(private fb: FormBuilder){}

  onSubmitFormation(){
    console.log("SendForm")
  }
}

import { Component } from '@angular/core';
import { FormBuilder, FormGroup, NgForm } from '@angular/forms';
import { IFormation } from 'src/app/interfaces/formation';

@Component({
  selector: 'app-create-forma',
  templateUrl: './create-forma.component.html',
  styleUrls: ['./create-forma.component.scss']
})
export class CreateFormaComponent {
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

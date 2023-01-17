import { Component } from '@angular/core';
import { IFormation } from 'src/app/interfaces/formation';

@Component({
  selector: 'app-list-forma',
  templateUrl: './list-forma.component.html',
  styleUrls: ['./list-forma.component.scss']
})
export class ListFormaComponent {
  formations : IFormation[]=[
    {id:'0',theme:undefined!,stheme:undefined!,sstheme:undefined!,seances:undefined!,formateurs:undefined!,isConfirmed:true,isIntra:true,isPerso:false,minPart:10,nbPart:5,link:"toto.fr",price:500},
    {id:'1',theme:undefined!,stheme:undefined!,sstheme:undefined!,seances:undefined!,formateurs:undefined!,isConfirmed:true,isIntra:true,isPerso:false,minPart:10,nbPart:6,link:"tata.fr",price:400}
  ]

}

import { Component } from '@angular/core';
import { IFormation } from 'src/app/interfaces/formation';

@Component({
  selector: 'app-cards-list',
  templateUrl: './cards-list.component.html',
  styleUrls: ['./cards-list.component.scss']
})
export class CardsListComponent {
  formations : IFormation[]=[
    {id:'0',name:"Formation JEE",description:"Ut minus asperiores ut dolores corporis a facilis quia ea autem iusto ea voluptatem temporibus et consequatur magni ut praesentium facere. 33 laborum perferendis non mollitia quas et placeat veniam. Aut saepe quam et consequatur omnis in atque autem ut nostrum nesciunt. Aut quasi temporibus sit nihil mollitia vel obcaecati mollitia sit doloribus minus rem similique recusandae.",theme:undefined!,stheme:undefined!,sstheme:undefined!,seances:undefined!,formateurs:undefined!,isConfirmed:true,isIntra:true,isPerso:false,minPart:10,nbPart:5,link:"toto.fr",price:500},
    {id:'1',name:"Formation JPA/Spring",description:"Ut minus asperiores ut dolores corporis a facilis quia ea autem iusto ea voluptatem temporibus et consequatur magni ut praesentium facere. 33 laborum perferendis non mollitia quas et placeat veniam. Aut saepe quam et consequatur omnis in atque autem ut nostrum nesciunt. Aut quasi temporibus sit nihil mollitia vel obcaecati mollitia sit doloribus minus rem similique recusandae.",theme:undefined!,stheme:undefined!,sstheme:undefined!,seances:undefined!,formateurs:undefined!,isConfirmed:true,isIntra:true,isPerso:false,minPart:10,nbPart:6,link:"tata.fr",price:400}
  ]
}

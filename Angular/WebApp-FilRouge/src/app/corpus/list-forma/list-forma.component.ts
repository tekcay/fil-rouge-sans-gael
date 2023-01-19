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

  // formations : Formation[]=[
  //   {id: '0', formateurId: '0', name: "Formation JEE",
  //     isConfirmed: true,
  //     minParticipants: 10,
  //     isPerso: true,
  //     isInterEntreprise: true,
  //     link: 'toto.fr',
  //     prix: 500,
  //     themeId: '0',
  //     stheme: ['0'],
  //     sstheme: ['0'],
  //     description: "Ut minus asperiores ut dolores corporis a facilis quia ea autem iusto ea voluptatem temporibus et consequatur magni ut praesentium facere. 33 laborum perferendis non mollitia quas et placeat veniam. Aut saepe quam et consequatur omnis in atque autem ut nostrum nesciunt. Aut quasi temporibus sit nihil mollitia vel obcaecati mollitia sit doloribus minus rem similique recusandae."
  // },
  // {id: '1', formateurId: '1', name: "Formation JPA/Spring",
  //     isConfirmed: true,
  //     minParticipants: 10,
  //     isPerso: true,
  //     isInterEntreprise: true,
  //     link: 'toto.fr',
  //     prix: 500,
  //     themeId: '0',
  //     stheme: ['0'],
  //     sstheme: ['0'],
  //     description: "Ut minus asperiores ut dolores corporis a facilis quia ea autem iusto ea voluptatem temporibus et consequatur magni ut praesentium facere. 33 laborum perferendis non mollitia quas et placeat veniam. Aut saepe quam et consequatur omnis in atque autem ut nostrum nesciunt. Aut quasi temporibus sit nihil mollitia vel obcaecati mollitia sit doloribus minus rem similique recusandae."
  // }
  //   ]

    formations : Formation[] =[];
    formation : Formation = undefined!;
    constructor(private formationService:FormationService){}

    ngOnInit():void {
      this.formationService.findAll().subscribe(data=>{this.formations=data});
      console.log(this.formations.length)
    }

    // private setFormationList(){
    //   this.formationsList.push.apply(this.formationService.formationList)
    //   console.log(this.formationsList)
    // }
}

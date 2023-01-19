import { Component } from '@angular/core';
import { IFormation } from 'src/app/interfaces/formation';

@Component({
  selector: 'app-cards-list',
  templateUrl: './cards-list.component.html',
  styleUrls: ['./cards-list.component.scss']
})
export class CardsListComponent {
  formations : IFormation[]=[
    {id: '0', formateurId: '0', name: "Formation JEE",
      isConfirmed: true,
      minParticipants: 10,
      isPerso: true,
      isInterEntreprise: true,
      link: 'toto.fr',
      prix: 500,
      themeId: '0',
      stheme: ['0'],
      sstheme: ['0'],
      description: "Ut minus asperiores ut dolores corporis a facilis quia ea autem iusto ea voluptatem temporibus et consequatur magni ut praesentium facere. 33 laborum perferendis non mollitia quas et placeat veniam. Aut saepe quam et consequatur omnis in atque autem ut nostrum nesciunt. Aut quasi temporibus sit nihil mollitia vel obcaecati mollitia sit doloribus minus rem similique recusandae."
  },
  {id: '1', formateurId: '1', name: "Formation JPA/Spring",
      isConfirmed: true,
      minParticipants: 10,
      isPerso: true,
      isInterEntreprise: true,
      link: 'toto.fr',
      prix: 500,
      themeId: '0',
      stheme: ['0'],
      sstheme: ['0'],
      description: "Ut minus asperiores ut dolores corporis a facilis quia ea autem iusto ea voluptatem temporibus et consequatur magni ut praesentium facere. 33 laborum perferendis non mollitia quas et placeat veniam. Aut saepe quam et consequatur omnis in atque autem ut nostrum nesciunt. Aut quasi temporibus sit nihil mollitia vel obcaecati mollitia sit doloribus minus rem similique recusandae."
  },]
}

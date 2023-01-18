import { Component } from '@angular/core';
import { ISTheme } from 'src/app/interfaces/s-theme';
import { ISsTheme } from 'src/app/interfaces/ss-theme';
import { ITheme } from 'src/app/interfaces/theme';

@Component({
  selector: 'app-cards-search',
  templateUrl: './cards-search.component.html',
  styleUrls: ['./cards-search.component.scss']
})
export class CardsSearchComponent {
  themes: ITheme[] = [
    {id:'0',name:'Developpement web',SThemeList:[]},
    {id:'1',name:'Developpement jeu mobile',SThemeList:[]},
    {id:'2',name:'Developpement jeu video',SThemeList:[]},
    {id:'3',name:'Developpement applicatioon',SThemeList:[]}
  ]

  sthemes: ISTheme[] = [
    {id:'0',name:'Angular',SSThemeList:[]},
    {id:'1',name:'Java',SSThemeList:[]},
  ]

  ssthemes: ISsTheme[] = [
    {id:'0',name:'CRUD'},
    {id:'1',name:'Interface'}
  ]
}

import { IFormateur } from "./formateur";
import { ISTheme } from "./s-theme";
import { ISeance } from "./seance";
import { ISsTheme } from "./ss-theme";
import { ITheme } from "./theme";

export interface IFormation {
  id:string;
  name:string;
  description:string;
  theme:ITheme;
  stheme:ISTheme[];
  sstheme:ISsTheme[];
  seances:ISeance[];
  formateurs:IFormateur[];
  isConfirmed:boolean;
  isPerso:boolean;
  isIntra:boolean;
  minPart:number;
  nbPart:number;
  link:string;
  price:number;
}

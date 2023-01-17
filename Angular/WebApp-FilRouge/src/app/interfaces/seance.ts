import { ISalle } from "./salle";

export interface ISeance {
  id:string;
  dateStart:string;
  dateLast:string;
  Salle:ISalle[];
}

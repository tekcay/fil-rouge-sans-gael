import { IEvaluation } from "./evaluation";
import { IUser } from "./user";

export interface IFormateur extends IUser {
  exp:number;
  evalList:IEvaluation[];
}

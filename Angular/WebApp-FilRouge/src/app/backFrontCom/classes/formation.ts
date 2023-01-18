import { IFormateur } from "src/app/interfaces/formateur";
import { IFormation } from "src/app/interfaces/formation";
import { ISTheme } from "src/app/interfaces/s-theme";
import { ISeance } from "src/app/interfaces/seance";
import { ISsTheme } from "src/app/interfaces/ss-theme";
import { ITheme } from "src/app/interfaces/theme";

export class Formation{
  constructor(
    id: string,
    name: string,
    description: string,
    theme: ITheme,
    stheme: ISTheme[],
    sstheme: ISsTheme[],
    seances: ISeance[],
    formateurs: IFormateur[],
    isConfirmed: boolean,
    isPerso: boolean,
    isIntra: boolean,
    minPart: number,
    nbPart: number,
    link: string,
    price: number
  ){}


public get id(): string {
    return this.id;
  }
public set id(value: string) {
    this.id = value;
  }

  public get name(): string {
    return this.name;
  }
  public set name(value: string) {
    this.name = value;
  }

  public get description(): string {
    return this.description;
  }
  public set description(value: string) {
    this.description = value;
  }

  public get theme(): ITheme {
    return this.theme;
  }
  public set theme(value: ITheme) {
    this.theme = value;
  }


  public get stheme(): ISTheme[] {
    return this.stheme;
  }
  public set stheme(value: ISTheme[]) {
    this.stheme = value;
  }

  public get sstheme(): ISsTheme[] {
    return this.sstheme;
  }
  public set sstheme(value: ISsTheme[]) {
    this.sstheme = value;
  }

  public get seances(): ISeance[] {
    return this.seances;
  }
  public set seances(value: ISeance[]) {
    this.seances = value;
  }

  public get formateurs(): IFormateur[] {
    return this.formateurs;
  }
  public set formateurs(value: IFormateur[]) {
    this.formateurs = value;
  }

  public get isConfirmed(): boolean {
    return this.isConfirmed;
  }
  public set isConfirmed(value: boolean) {
    this.isConfirmed = value;
  }

  public get isPerso(): boolean {
    return this.isPerso;
  }
  public set isPerso(value: boolean) {
    this.isPerso = value;
  }

  public get isIntra(): boolean {
    return this.isIntra;
  }
  public set isIntra(value: boolean) {
    this.isIntra = value;
  }

  public get minPart(): number {
    return this.minPart;
  }
  public set minPart(value: number) {
    this.minPart = value;
  }

  public get nbPart(): number {
    return this.nbPart;
  }
  public set nbPart(value: number) {
    this.nbPart = value;
  }

  public get link(): string {
    return this.link;
  }
  public set link(value: string) {
    this.link = value;
  }

  public get price(): number {
    return this.price;
  }
  public set price(value: number) {
    this.price = value;
  }



}

import { IFormateur } from "src/app/interfaces/formateur";
import { IFormation } from "src/app/interfaces/formation";
import { ISTheme } from "src/app/interfaces/s-theme";
import { ISeance } from "src/app/interfaces/seance";
import { ISsTheme } from "src/app/interfaces/ss-theme";
import { ITheme } from "src/app/interfaces/theme";

export class Formation{
  constructor(
    id: string,
    formateurId: string,
    name: string,
    isConfirmed: boolean,
    minParticipants: number,
    isPerso: boolean,
    isInterEntreprise: boolean,
    link: string,
    prix: number,
    themeId: string,
    stheme: string[],
    sstheme: string[],
    description: string
  ){}

public get id(): string {
    return this.id;
  }
public set id(value: string) {
    this.id = value;
  }

  public get formateurId(): string {
    return this.formateurId;
  }
  public set formateurId(value: string) {
    this.formateurId = value;
  }
 public get name(): string {
    return this.name;
  }
public set name(value: string) {
    this.name = value;
  }

public get isConfirmed(): boolean {
    return this.isConfirmed;
  }
public set isConfirmed(value: boolean) {
    this.isConfirmed = value;
  }

public get minParticipants(): number {
    return this.minParticipants;
  }
public set minParticipants(value: number) {
    this.minParticipants = value;
  }

public get isPerso(): boolean {
    return this.isPerso;
  }
public set isPerso(value: boolean) {
    this.isPerso = value;
  }

public get isInterEntreprise(): boolean {
    return this.isInterEntreprise;
  }
public set isInterEntreprise(value: boolean) {
    this.isInterEntreprise = value;
  }

public get link(): string {
    return this.link;
  }
public set link(value: string) {
    this.link = value;
  }

public get prix(): number {
    return this.prix;
  }
public set prix(value: number) {
    this.prix = value;
  }

  public get themeId(): string {
    return this.themeId;
  }
public set themeId(value: string) {
    this.themeId = value;
  }

  public get stheme(): string[] {
    return this.stheme;
  }
public set stheme(value: string[]) {
    this.stheme = value;
  }

  public get sstheme(): string[] {
    return this.sstheme;
  }
  public set sstheme(value: string[]) {
    this.sstheme = value;
  }

  public get description(): string {
    return this.description;
  }
  public set description(value: string) {
    this.description = value;
  }


}

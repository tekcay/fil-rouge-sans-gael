import { ISTheme } from "src/app/interfaces/s-theme";
import { ISsTheme } from "src/app/interfaces/ss-theme";

export class Stheme{

  constructor(
    id: string,
    name: string,
    SSThemeList: ISsTheme[]
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

  public get SSThemeList(): ISsTheme[] {
    return this.SSThemeList;
  }
  public set SSThemeList(value: ISsTheme[]) {
    this.SSThemeList = value;
  }
}

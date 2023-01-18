import { ISTheme } from "src/app/interfaces/s-theme";

export class Theme{
  constructor(
    id: string,
    name: string,
    SSThemeList: ISTheme[]
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

  public get SThemeList(): ISTheme[] {
    return this.SThemeList;
  }
  public set SThemeList(value: ISTheme[]) {
    this.SThemeList = value;
  }
}

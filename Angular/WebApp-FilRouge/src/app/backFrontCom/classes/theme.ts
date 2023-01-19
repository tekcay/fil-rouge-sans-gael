import { ISTheme } from "src/app/interfaces/s-theme";

export class Theme{
  constructor(
    id: number,
    name: string
  ){}

  public get id(): number {
    return this.id;
  }
  public set id(value: number) {
    this.id = value;
  }

  public get name(): string {
    return this.name;
  }
  public set name(value: string) {
    this.name = value;
  }

}

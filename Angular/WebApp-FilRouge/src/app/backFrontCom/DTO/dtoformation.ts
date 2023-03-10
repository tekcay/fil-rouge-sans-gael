export class DTOFormation {
  constructor(
    name:string,
    description:string,
    themeId: number,
    sousThemesId: number[],
    ssThemesId: number[]
  ){}



  public get name(): string {
    return this.name
  }
  public set name(value: string) {
    this.name = value
  }

  public get description(): string {
    return this.description
  }
  public set description(value: string) {
    this.description = value
  }

  public get themeId(): number {
    return this.themeId
  }
  public set themeId(value: number) {
    this.themeId = value
  }

  public get sousThemesId(): number[] {
    return this.sousThemesId
  }
  public set sousThemesId(value: number[]) {
    this.sousThemesId = value
  }

  public get ssThemesId(): number[] {
    return this.ssThemesId
  }
  public set ssThemesId(value: number[]) {
    this.ssThemesId = value
  }

}

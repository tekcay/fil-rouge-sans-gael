import { IFormateur } from "./formateur";
import { ISTheme } from "./s-theme";
import { ISeance } from "./seance";
import { ISsTheme } from "./ss-theme";
import { ITheme } from "./theme";

export interface IFormation {
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
}

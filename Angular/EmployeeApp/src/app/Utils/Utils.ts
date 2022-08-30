import { Injectable } from "@angular/core";
@Injectable({
    providedIn: 'root'
})
export class Utils{

    constructor(){}

    /* this functions are utilitaries for all proyect */

    capitalize(str: string): string{
        return !this.isEmpty(str) ? "" : str.trim().replace(/  +/g, " ").split(" ").map(data => {return data.charAt(0).toUpperCase() + data.slice(1);}).join(" ");
    }

    isEmpty(str: string): boolean{
        return (['', undefined, null, NaN].indexOf(str) == -1);
    }

    formatDataArray(data: any[]): any[]{
        return data.map(person => {person.name = this.capitalize(person.name); return person;});
    }
}
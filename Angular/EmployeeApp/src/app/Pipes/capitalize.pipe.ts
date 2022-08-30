import { Pipe, PipeTransform } from '@angular/core';
import { Utils } from '../Utils/Utils';

@Pipe({name: 'capitalize'})
export class capitalize implements PipeTransform {
    constructor(private utils: Utils){}
    transform(str: string): string {
        return this.utils.capitalize(str);
    }
}
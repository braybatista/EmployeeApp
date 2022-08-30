import { Pipe, PipeTransform  } from '@angular/core';
import { Employee } from '../Models/Employee';

@Pipe({
    name: 'myfilter',
    pure: false
})
export class MyFilterPipe implements PipeTransform {
  transform(items: any[], filter: Employee): any {  
    if (!items || !filter) {  
        return items;  
    }
    
    return items.filter(item => {
      return this.cleanFields(item.id+"").indexOf(this.cleanFields(filter.employee_name+"")) !== -1
      || this.cleanFields(item.employee_name+"").indexOf(this.cleanFields(filter.employee_name+"")) !== -1
      || this.cleanFields(item.employee_salary+"").indexOf(this.cleanFields(filter.employee_name+"")) !== -1
      || this.cleanFields(item.employee_age+"").indexOf(this.cleanFields(filter.employee_name+"")) !== -1
      || this.cleanFields(item.employee_anual_salary+"").indexOf(this.cleanFields(filter.employee_name+"")) !== -1;
    });  
  }

  cleanFields(field: string){
    return field.toLowerCase()
    .trim()
    .replace(/ /g, "")
    .replace(/[á]/ig, "a")
    .replace(/[é]/ig, "e")
    .replace(/[í]/ig, "i")
    .replace(/[ó]/ig, "o")
    .replace(/[ú]/ig, "u");
  }
}
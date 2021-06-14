import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'desc'
})
export class DescPipe implements PipeTransform {

  transform(value: string, description :string): string {
  let temp : string = "...";
    return  description.substring(0, 18)+ temp ;
  }

}

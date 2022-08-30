import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Employee } from 'src/app/Models/Employee';
import { Utils } from 'src/app/Utils/Utils';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'angular-tips';

  getData: any = new Employee();

  constructor(private utils: Utils, private router: Router){}

}

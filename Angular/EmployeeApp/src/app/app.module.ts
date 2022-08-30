import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';

import { AppComponent } from './components/app/app.component';
import { HomeComponent } from './components/home/home.component';

import { EmployeeService } from './Services/employee.service';

import { Utils } from './Utils/Utils';
import { capitalize } from './Pipes/capitalize.pipe';
import { MyFilterPipe } from './Pipes/filter.component';
@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    capitalize,
    MyFilterPipe
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [
    EmployeeService,
    Utils
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }

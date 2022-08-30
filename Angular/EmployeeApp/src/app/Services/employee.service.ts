import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Employee } from '../Models/Employee';
import { ResponseAll } from '../Models/ResponseAll';
import { ResponseSingle } from '../Models/ResponseSingle';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  private Url = 'http://localhost:8081/api/employees'

  constructor(private http: HttpClient) { }

  findAll(){
    return this.http.get<ResponseAll>(this.Url)
  }

  findEmployee(codigo_cliente: number){
    return this.http.get<ResponseSingle>(this.Url+"/"+codigo_cliente)
  }

}

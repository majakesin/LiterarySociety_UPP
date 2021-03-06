import { Injectable } from '@angular/core';
import {Observable} from "rxjs";
import {environment} from "../../environments/environment";
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class DocumentService {

  constructor(private http:HttpClient) { }

  public documentProcess(processId:any): Observable<any> {
    return this.http.get(`${environment.baseUrl}/writer/document/${processId}`);
  }

  public getNextTaskTable(processId:any): Observable<any> {
    return this.http.get(`${environment.baseUrl}/getNextTaskTable/${processId}`);
  }

  public getTable(processId:any): Observable<any> {
    return this.http.get(`${environment.baseUrl}/getTable/${processId}`);
  }
}

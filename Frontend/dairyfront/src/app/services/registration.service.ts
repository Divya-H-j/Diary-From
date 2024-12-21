import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class RegistrationService {
  serverurl="http://localhost:9090/registration"

  constructor(private http:HttpClient) { }
  
  getAll():Observable<Registration[]>{
    return this.http.get<Registration[]>(this.serverurl+"/registrations")
  }
}

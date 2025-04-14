import { Injectable } from '@angular/core';
import { Contacts } from '../models/contacts';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ContactsService {

 serverurl="http://localhost:9090/contact"

  constructor(private http:HttpClient){}
  getAllcontacts():Observable<Contacts[]>{
    return this.http.get<Contacts[]>(this.serverurl+"/contacts")
  }

  save(c:Contacts):Observable<Contacts>{
    return this.http.post<Contacts>(this.serverurl+"/addcon",c)
  }

   
}

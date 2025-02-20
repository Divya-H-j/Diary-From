import { Injectable } from '@angular/core';
import { Contacts } from '../models/contacts';

@Injectable({
  providedIn: 'root'
})
export class ContactsService {

 serverurl="http://localhost:4200/contacts"
   constructor(private http:HttpClient) { }
   getAll():Observable<Contacts[]>
   {
     return this.http.get<Contacts[]>(this.serverurl+"/registrations")
   }
   save(r:Contacts):Observable<Contacts>
   {
     return this.http.post<Contacts>(this.serverurl+"/addreg",r)
   }
}

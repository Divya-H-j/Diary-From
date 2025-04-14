import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { BuyNow } from '../models/buy-now';

@Injectable({
  providedIn: 'root'
})
export class BuyNowService {
  

  
   serverurl="http://localhost:9090/BuyNow"
  
    constructor(private http:HttpClient){}
    getAllBuyNow():Observable<BuyNow[]>{
      return this.http.get<BuyNow[]>(this.serverurl+"/BuyNows")
    }
  
    save(b:BuyNow):Observable<BuyNow>{
      return this.http.post<BuyNow>(this.serverurl+"/addBuy",b)
    }
}

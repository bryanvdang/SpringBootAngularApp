import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from "@angular/forms";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  
    public submitted:boolean;
    roomsearch : FormGroup;
    rooms : Room[];
    
        ngOnInit(){
            this.roomsearch = new FormGroup({
                checkin: new FormControl(''),
                checkout: new FormControl('')
                });
            
            this.rooms = ROOMS;
        }
    
    onSubmit({value, valid}: {value:Roomsearch, valid:boolean}) {
        console.log(value);
    }
    
    reserveRoom(value:string){
        console.log("Room id for reservation: " + value);
    }
}

    export interface Roomsearch {
        checkin:string;
        checkout:string;   
    }

    export interface Room{
        id:string;
        roomNumber:string;
        price:string;
        links:string;   
    }   

    var ROOMS : Room[] = [
    {
        "id": "123456",
        "roomNumber" : "308",
        "price" : "172",
        "links" : "" 
    },
    {
        "id": "56789",
        "roomNumber" : "309",
        "price" : "211",
        "links" : "" 
    },
    {
        "id": "963852",
        "roomNumber" : "311",
        "price" : "213",
        "links" : "" 
    }    
    ]
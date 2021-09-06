import { Component, OnInit, Input } from '@angular/core';
import {Room} from "../room";
import { RoomService} from "../room.service";
import { RoomListComponent } from '../room-list.component';
import { Router, ActivatedRouter} from '@angular/router';
@Component({
  selector: 'app-room-details',
  templateUrl: './room-details.component.html',
  styleUrls: ['./room-details.component.css']
})
export class RoomDetailsComponent implements OnInit {

  id: number
  room: Room;

  constructor(private route: ActivatedRouter, private router: Router,
  private RoomService: RoomService) { }

  ngOnInit() {
    this.room = new Room();
    this.id= this.route.snapshot.params[ 'id'];

    this.roomService.getRoom(this.id)
    .subsribe(data => {
      console.log(data)
      this.room =data;

    }, error => console.log(error));
  }
  list(){
    this.router.navigate(['rooms']);
  }
}

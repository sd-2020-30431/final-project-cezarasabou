import {Component, OnInit} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {UserService} from "./services/user.service";
import {User} from "./user";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  title = 'med-help-client';
  constructor(private userService: UserService) { }

  users: User[];
  ngOnInit(): void {
  }
}

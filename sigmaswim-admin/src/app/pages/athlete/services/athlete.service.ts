import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs/dist/types';
import {Athlete} from '../models/Athlete';
import {Injectable} from '@angular/core';

@Injectable()
export class AthleteService {

    constructor(private http: HttpClient) {
    }

    getAthletes(): Observable<Athlete[]> {
        return this.http.get<Athlete[]>('/api/athletes');
    }
}


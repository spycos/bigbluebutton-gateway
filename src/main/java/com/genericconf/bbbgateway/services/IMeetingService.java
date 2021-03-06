/**
 * Copyright 2010 Generic Conferencing, LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.genericconf.bbbgateway.services;

import java.util.Collection;

import com.genericconf.bbbgateway.domain.Attendee;
import com.genericconf.bbbgateway.domain.Meeting;

public interface IMeetingService {

	public void createMeeting(Meeting meeting);
	
	public Collection<Meeting> getMeetings();

	public Meeting findByMeetingID(String meetingID);

	public void addToWaitingRoom(Meeting meeting, Attendee att);

	public String joinMeeting(Meeting object, Attendee object2);

	public void bulkAllowAttendees(Meeting meeting);
	
}

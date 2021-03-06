/*
 *     Copyright 2015-2018 Austin Keener & Michael Ritter & Florian Spieß
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

package net.dv8tion.jda.core.events.role.update;

import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.entities.Role;

public class RoleUpdatePositionEvent extends GenericRoleUpdateEvent
{
    private final int oldPosition;
    private final int oldPositionRaw;

    public RoleUpdatePositionEvent(JDA api, long responseNumber, Role role, int oldPosition, int oldPositionRaw)
    {
        super(api, responseNumber, role);
        this.oldPosition = oldPosition;
        this.oldPositionRaw = oldPositionRaw;
    }

    public int getOldPosition()
    {
        return oldPosition;
    }

    public int getOldPositionRaw()
    {
        return oldPositionRaw;
    }
}

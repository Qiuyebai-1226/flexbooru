/*
 * Copyright (C) 2019 by onlymash <im@fiepi.me>, All rights reserved
 *
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program. If not, see <http://www.gnu.org/licenses/>.
 */

package onlymash.flexbooru.entity

import kotlinx.serialization.Optional
import kotlinx.serialization.Serializable

@Serializable
data class SearchPopular(
    var scheme: String,
    var host: String,

    // Danbooru: yyyy-mm-dd
    @Optional
    var date: String = "",

    // Danbooru: day week month
    @Optional
    var scale: String = "day",

    // Moebooru: 1d 1w 1m 1y
    @Optional
    var period: String = "1d",

    @Optional
    var username: String = "",
    @Optional
    var auth_key: String = "",

    @Optional
    var safe_mode: Boolean = true
)
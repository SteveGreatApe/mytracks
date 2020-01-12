/*
 * Copyright 2012 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.google.android.apps.mytracks.util;

import android.content.Context;

public class AnalyticsUtils {

  public static final String ACTION_EXPORT_ALL_PREFIX = "/action/export_all_";
  public static final String ACTION_EXPORT_PREFIX = "/action/export_";
  public static final String ACTION_EXPORT_DRIVE = "/action/export_drive";
  public static final String ACTION_EXPORT_FUSION_TABLES = "/action/export_fusion_tables";
  public static final String ACTION_EXPORT_MAPS = "/action/export_maps";
  public static final String ACTION_EXPORT_SPREADSHEETS = "/action/export_spreadsheets";
  public static final String ACTION_IMPORT_ALL_PREFIX = "/action/import_all_";
  public static final String ACTION_INSERT_MARKER = "/action/insert_marker";
  public static final String ACTION_PAUSE_TRACK = "/action/pause_track";
  public static final String ACTION_PLAY = "/action/play";
  public static final String ACTION_RECORD_TRACK = "/action/record_track";
  public static final String ACTION_RESUME_TRACK = "/action/resume_track";
  public static final String ACTION_SHARE_DRIVE = "/action/share_drive";
  public static final String ACTION_STOP_RECORDING = "/action/stop_recording";

  public static final String PAGE_TRACK_DETAIL = "/page/track_detail";
  public static final String PAGE_TRACK_LIST = "/page/track_list";

  public static final String SENSOR_ANT = "/sensor/ant";
  public static final String SENSOR_POLAR = "/sensor/polar";
  public static final String SENSOR_ZEPHYR = "/sensor/zephyr";

  private AnalyticsUtils() {}

  public static void sendPageViews(Context context, String page) {
  }

  public static void dispatch() {
  }
}
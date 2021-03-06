/*
 * Copyright (c) 2015 - present Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */

package infer.other;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

public class MainActivity extends ActionBarActivity {

  Object source() {
    return null;
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    source().toString();
  }

 protected void onCreate_1111111111111(Bundle savedInstanceState) {
    source().toString();
  }
protected void onCreate_b37(Bundle savedInstanceState) {
    source().toString();
  }

protected void onCreate_222222222222(Bundle savedInstanceState) {
    source().toString();
  }


  @SuppressWarnings("infer")
  void shouldNotBeReported() {
    source().toString();
  }

}

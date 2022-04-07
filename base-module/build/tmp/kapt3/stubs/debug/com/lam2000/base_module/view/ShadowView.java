package com.lam2000.base_module.view;

import java.lang.System;

@kotlin.Suppress(names = {"MemberVisibilityCanBePrivate", "unused"})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u00d8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0015\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b)\b\u0016\u0018\u0000 \u00b4\u00022\u00020\u0001:\u000e\u00b1\u0002\u00b2\u0002\u00b3\u0002\u00b4\u0002\u00b5\u0002\u00b6\u0002\u00b7\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0013\u0010\u00a9\u0001\u001a\u00030\u00aa\u00012\u0007\u0010\u00ab\u0001\u001a\u00020\u001bH\u0002J\u0013\u0010\u00ac\u0001\u001a\u00030\u00aa\u00012\u0007\u0010\u00ab\u0001\u001a\u00020\u001bH\u0002J\u0013\u0010\u00ad\u0001\u001a\u00030\u00aa\u00012\u0007\u0010\u00ab\u0001\u001a\u00020\u001bH\u0002J\u0013\u0010\u00ae\u0001\u001a\u00030\u00aa\u00012\u0007\u0010\u00ab\u0001\u001a\u00020\u001bH\u0002J\u0013\u0010\u00af\u0001\u001a\u00030\u00aa\u00012\u0007\u0010\u00ab\u0001\u001a\u00020\u001bH\u0002J\u0012\u0010\u00b0\u0001\u001a\u00020\f2\u0007\u0010\u00b1\u0001\u001a\u00020\fH\u0002J\u0013\u0010\u00b2\u0001\u001a\u00030\u00b3\u00012\u0007\u0010\u00b1\u0001\u001a\u00020\fH\u0002J\u001b\u0010\u00b4\u0001\u001a\u00020\t2\u0007\u0010\u00b5\u0001\u001a\u00020\t2\u0007\u0010\u00b6\u0001\u001a\u00020\fH\u0002J\u001a\u0010\u00b7\u0001\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f2\u0007\u0010\u00b8\u0001\u001a\u00020\fH\u0002J\t\u0010\u00b9\u0001\u001a\u00020\u001fH\u0002J\u0011\u0010\u00ba\u0001\u001a\u00020\u001f2\u0006\u0010b\u001a\u00020cH\u0002J\t\u0010\u00bb\u0001\u001a\u00020\u001fH\u0002J\n\u0010\u00bc\u0001\u001a\u00030\u00aa\u0001H\u0002J$\u0010\u00bd\u0001\u001a\u00020\f2\u0007\u0010\u00be\u0001\u001a\u00020\f2\u0007\u0010\u00bf\u0001\u001a\u00020\f2\u0007\u0010\u00c0\u0001\u001a\u00020\fH\u0002J#\u0010\u00c1\u0001\u001a\u00020\f2\u0007\u0010\u00c2\u0001\u001a\u00020\f2\t\u0010\u00c3\u0001\u001a\u0004\u0018\u00010\fH\u0002\u00a2\u0006\u0003\u0010\u00c4\u0001J\u0016\u0010\u00c5\u0001\u001a\u00030\u00aa\u00012\n\u0010\u00c6\u0001\u001a\u0005\u0018\u00010\u00c7\u0001H\u0002J*\u0010\u00c8\u0001\u001a\u00020\u001f2\n\u0010\u00c6\u0001\u001a\u0005\u0018\u00010\u00c7\u00012\n\u0010\u00c9\u0001\u001a\u0005\u0018\u00010\u00ca\u00012\u0007\u0010\u00cb\u0001\u001a\u00020ZH\u0014J\u001e\u0010\u00cc\u0001\u001a\u00030\u00aa\u00012\n\u0010\u00c6\u0001\u001a\u0005\u0018\u00010\u00c7\u00012\u0006\u0010b\u001a\u00020cH\u0002J\u0016\u0010\u00cd\u0001\u001a\u00030\u00aa\u00012\n\u0010\u00c6\u0001\u001a\u0005\u0018\u00010\u00c7\u0001H\u0002J\u0016\u0010\u00ce\u0001\u001a\u00030\u00aa\u00012\n\u0010\u00c6\u0001\u001a\u0005\u0018\u00010\u00c7\u0001H\u0002J\u0012\u0010\u00cf\u0001\u001a\u00020\f2\u0007\u0010\u00b6\u0001\u001a\u00020\fH\u0002J\u0007\u0010\u00d0\u0001\u001a\u00020\fJ\u0007\u0010\u00d1\u0001\u001a\u00020\fJ\t\u0010\u00d2\u0001\u001a\u00020\u0019H\u0002J\t\u0010\u00d3\u0001\u001a\u00020\u001bH\u0002J\t\u0010\u00d4\u0001\u001a\u00020\u001dH\u0002J\u0012\u0010\u00d5\u0001\u001a\u00020\f2\u0007\u0010\u00d6\u0001\u001a\u00020\fH\u0002J\u0012\u0010\u00d7\u0001\u001a\u00020\f2\u0007\u0010\u00d6\u0001\u001a\u00020\fH\u0002J\u001b\u0010\u00d8\u0001\u001a\u00020/2\u0007\u0010\u00d9\u0001\u001a\u00020/2\u0007\u0010\u00b6\u0001\u001a\u00020\fH\u0002J\t\u0010\u00da\u0001\u001a\u00020\fH\u0002J?\u0010\u00da\u0001\u001a\u00020\u001d2\u0007\u0010\u00db\u0001\u001a\u00020\f2\u0007\u0010\u00dc\u0001\u001a\u00020\f2\u0007\u0010\u00dd\u0001\u001a\u00020\f2\u0007\u0010\u00de\u0001\u001a\u00020\f2\u0007\u0010\u00df\u0001\u001a\u00020\f2\u0007\u0010\u00e0\u0001\u001a\u00020\fH\u0002J\u001b\u0010\u00e1\u0001\u001a\u00020\f2\u0007\u0010\u00be\u0001\u001a\u00020\f2\u0007\u0010\u00bf\u0001\u001a\u00020\fH\u0002J\u001b\u0010\u00e2\u0001\u001a\u00020\f2\u0007\u0010\u00db\u0001\u001a\u00020\f2\u0007\u0010\u00b1\u0001\u001a\u00020\fH\u0002J\u001b\u0010\u00e3\u0001\u001a\u00020\f2\u0007\u0010\u00db\u0001\u001a\u00020\f2\u0007\u0010\u00b1\u0001\u001a\u00020\fH\u0002J\u001f\u0010\u00e4\u0001\u001a\u000f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u00e5\u00012\u0007\u0010\u00b1\u0001\u001a\u00020\fH\u0002J\u001c\u0010\u00e6\u0001\u001a\u00030\u00e7\u00012\u0007\u0010\u00e8\u0001\u001a\u00020/2\u0007\u0010\u00b1\u0001\u001a\u00020\fH\u0002J\t\u0010\u00e9\u0001\u001a\u00020\u001bH\u0002J%\u0010\u00ea\u0001\u001a\u00030\u00eb\u00012\u0007\u0010\u00e8\u0001\u001a\u00020/2\u0007\u0010\u00ec\u0001\u001a\u00020\f2\u0007\u0010\u00ed\u0001\u001a\u00020\fH\u0002J%\u0010\u00ee\u0001\u001a\u00030\u00ef\u00012\u0007\u0010\u00f0\u0001\u001a\u00020\f2\u0007\u0010\u00f1\u0001\u001a\u00020\f2\u0007\u0010\u00e0\u0001\u001a\u00020\fH\u0002J@\u0010\u00ee\u0001\u001a\u00030\u00ef\u00012\u0007\u0010\u00f0\u0001\u001a\u00020\f2\u0007\u0010\u00f1\u0001\u001a\u00020\f2\u0007\u0010\u00f2\u0001\u001a\u00020\f2\u0007\u0010\u00f3\u0001\u001a\u00020\f2\u0007\u0010\u00f4\u0001\u001a\u00020\f2\u0007\u0010\u00f5\u0001\u001a\u00020\fH\u0002J\u001b\u0010\u00f6\u0001\u001a\u00020\f2\u0007\u0010\u00ec\u0001\u001a\u00020\f2\u0007\u0010\u00ed\u0001\u001a\u00020\fH\u0002J\t\u0010\u00f7\u0001\u001a\u00020\fH\u0002J\t\u0010\u00f8\u0001\u001a\u00020\fH\u0002J\t\u0010\u00f9\u0001\u001a\u00020\fH\u0002J\t\u0010\u00fa\u0001\u001a\u00020\fH\u0002J\t\u0010\u00fb\u0001\u001a\u00020\fH\u0002J\u0013\u0010\u00fc\u0001\u001a\u00030\u00fd\u00012\u0007\u0010\u00fe\u0001\u001a\u00020~H\u0002J\t\u0010\u00ff\u0001\u001a\u00020\u001bH\u0002J\t\u0010\u0080\u0002\u001a\u00020\u001dH\u0002J\t\u0010\u0081\u0002\u001a\u00020\u0019H\u0002J\t\u0010\u0082\u0002\u001a\u00020\u001bH\u0002J\t\u0010\u0083\u0002\u001a\u00020\u001dH\u0002J\t\u0010\u0084\u0002\u001a\u00020\fH\u0002J.\u0010\u0085\u0002\u001a\u00030\u0086\u00022\u0007\u0010\u00e8\u0001\u001a\u00020/2\u0007\u0010\u00b1\u0001\u001a\u00020\f2\u0007\u0010\u00ec\u0001\u001a\u00020\f2\u0007\u0010\u00ed\u0001\u001a\u00020\fH\u0002J\u0007\u0010\u0087\u0002\u001a\u00020\u001fJ\u0007\u0010\u0088\u0002\u001a\u00020\u001fJ\n\u0010\u0089\u0002\u001a\u00030\u00aa\u0001H\u0002J\n\u0010\u008a\u0002\u001a\u00030\u00aa\u0001H\u0002J\n\u0010\u008b\u0002\u001a\u00030\u00aa\u0001H\u0002J\n\u0010\u008c\u0002\u001a\u00030\u00aa\u0001H\u0002J&\u0010\u008d\u0002\u001a\u00030\u00aa\u00012\u0014\u0010\u008e\u0002\u001a\u000b\u0012\u0006\b\u0001\u0012\u00020\u00190\u008f\u0002\"\u00020\u0019H\u0002\u00a2\u0006\u0003\u0010\u0090\u0002J\n\u0010\u0091\u0002\u001a\u00030\u00aa\u0001H\u0002J\n\u0010\u0092\u0002\u001a\u00030\u00aa\u0001H\u0002J\u0012\u0010\u0093\u0002\u001a\u00030\u00aa\u00012\u0006\u0010b\u001a\u00020cH\u0002J\n\u0010\u0094\u0002\u001a\u00030\u00aa\u0001H\u0002J\u0012\u0010\u0095\u0002\u001a\u00030\u00aa\u00012\u0006\u0010b\u001a\u00020cH\u0002J\u0012\u0010\u0096\u0002\u001a\u00030\u00aa\u00012\u0006\u0010b\u001a\u00020cH\u0002J\u0012\u0010\u0097\u0002\u001a\u00030\u00aa\u00012\u0006\u0010b\u001a\u00020cH\u0002J\n\u0010\u0098\u0002\u001a\u00030\u00aa\u0001H\u0002J\n\u0010\u0099\u0002\u001a\u00030\u00aa\u0001H\u0002J\n\u0010\u009a\u0002\u001a\u00030\u00aa\u0001H\u0002J\n\u0010\u009b\u0002\u001a\u00030\u00aa\u0001H\u0002J\n\u0010\u009c\u0002\u001a\u00030\u00aa\u0001H\u0002J\n\u0010\u009d\u0002\u001a\u00030\u00aa\u0001H\u0002J\u001c\u0010\u009e\u0002\u001a\u00030\u00aa\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\t\u0010\u009f\u0002\u001a\u00020\u001fH\u0002J\u0012\u0010\u00a0\u0002\u001a\u00020\f2\u0007\u0010\u00b6\u0001\u001a\u00020\tH\u0002J\u0012\u0010\u00a1\u0002\u001a\u00020\t2\u0007\u0010\u00b6\u0001\u001a\u00020\fH\u0002J\u0016\u0010\u00a2\u0002\u001a\u00030\u00aa\u00012\n\u0010\u00c6\u0001\u001a\u0005\u0018\u00010\u00c7\u0001H\u0014J,\u0010\u00a3\u0002\u001a\u00030\u00aa\u00012\u0007\u0010\u00a4\u0002\u001a\u00020\f2\u0007\u0010\u00a5\u0002\u001a\u00020\f2\u0007\u0010\u00a6\u0002\u001a\u00020\f2\u0007\u0010\u00a7\u0002\u001a\u00020\fJ5\u0010\u00a3\u0002\u001a\u00030\u00aa\u00012\u0007\u0010\u00a8\u0002\u001a\u00020\f2\u0007\u0010\u00a4\u0002\u001a\u00020\f2\u0007\u0010\u00a5\u0002\u001a\u00020\f2\u0007\u0010\u00a6\u0002\u001a\u00020\f2\u0007\u0010\u00a7\u0002\u001a\u00020\fJ5\u0010\u00a9\u0002\u001a\u00030\u00aa\u00012\u0007\u0010\u00aa\u0002\u001a\u00020\f2\u0007\u0010\u00ab\u0002\u001a\u00020\f2\u0007\u0010\u00b1\u0001\u001a\u00020\f2\u0007\u0010\u00b6\u0001\u001a\u00020\f2\u0007\u0010\u00b5\u0001\u001a\u00020\tJ\u0011\u0010\u00ac\u0002\u001a\u00030\u00aa\u00012\u0007\u0010\u00b6\u0001\u001a\u00020\fJ\u0011\u0010\u00ad\u0002\u001a\u00030\u00aa\u00012\u0007\u0010\u00b1\u0001\u001a\u00020\fJ\u0011\u0010\u00ae\u0002\u001a\u00030\u00aa\u00012\u0007\u0010\u00aa\u0002\u001a\u00020\fJ\u0011\u0010\u00af\u0002\u001a\u00030\u00aa\u00012\u0007\u0010\u00b5\u0001\u001a\u00020\tJ\u0011\u0010\u00b0\u0002\u001a\u00030\u00aa\u00012\u0007\u0010\u00ab\u0002\u001a\u00020\fR$\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u00020!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R$\u0010+\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u000f\"\u0004\b-\u0010\u0011R\u001a\u0010.\u001a\u00020/X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u000e\u00104\u001a\u00020/X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u00105\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u000f\"\u0004\b7\u0010\u0011R$\u00108\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u000f\"\u0004\b:\u0010\u0011R$\u0010;\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u000f\"\u0004\b=\u0010\u0011R$\u0010>\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u000f\"\u0004\b@\u0010\u0011R$\u0010A\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u000f\"\u0004\bC\u0010\u0011R$\u0010D\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\u000f\"\u0004\bF\u0010\u0011R$\u0010H\u001a\u00020G2\u0006\u0010\u000b\u001a\u00020G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR$\u0010M\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bN\u0010\u000f\"\u0004\bO\u0010\u0011R\u000e\u0010P\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010T\u001a\u00020\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u001a\u0010Y\u001a\u00020ZX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\u001a\u0010_\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b`\u0010(\"\u0004\ba\u0010*R\u000e\u0010b\u001a\u00020cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010d\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\be\u0010\u000f\"\u0004\bf\u0010\u0011R\u001a\u0010g\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bh\u0010\u000f\"\u0004\bi\u0010\u0011R$\u0010j\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bk\u0010\u000f\"\u0004\bl\u0010\u0011R\u000e\u0010m\u001a\u00020\fX\u0082D\u00a2\u0006\u0002\n\u0000R$\u0010n\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bo\u0010\u000f\"\u0004\bp\u0010\u0011R$\u0010q\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\br\u0010\u000f\"\u0004\bs\u0010\u0011R$\u0010t\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bu\u0010\u000f\"\u0004\bv\u0010\u0011R$\u0010w\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bx\u0010\u000f\"\u0004\by\u0010\u0011R$\u0010z\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b{\u0010\u000f\"\u0004\b|\u0010\u0011R\u001d\u0010}\u001a\u00020~X\u0086\u000e\u00a2\u0006\u0011\n\u0000\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001d\u0010\u0083\u0001\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0084\u0001\u0010(\"\u0005\b\u0085\u0001\u0010*R\u001d\u0010\u0086\u0001\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0087\u0001\u0010\u0015\"\u0005\b\u0088\u0001\u0010\u0017R\'\u0010\u0089\u0001\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@FX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008a\u0001\u0010\u000f\"\u0005\b\u008b\u0001\u0010\u0011R\'\u0010\u008c\u0001\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@FX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008d\u0001\u0010\u000f\"\u0005\b\u008e\u0001\u0010\u0011R\'\u0010\u008f\u0001\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@FX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0090\u0001\u0010\u000f\"\u0005\b\u0091\u0001\u0010\u0011R\u001d\u0010\u0092\u0001\u001a\u00020/X\u0086.\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0093\u0001\u00101\"\u0005\b\u0094\u0001\u00103R\u000f\u0010\u0095\u0001\u001a\u00020/X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\'\u0010\u0096\u0001\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@FX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0097\u0001\u0010\u000f\"\u0005\b\u0098\u0001\u0010\u0011R\'\u0010\u0099\u0001\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@FX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u009a\u0001\u0010\u000f\"\u0005\b\u009b\u0001\u0010\u0011R\u000f\u0010\u009c\u0001\u001a\u00020\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u009d\u0001\u001a\u00020\u001dX\u0082.\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u009e\u0001\u001a\u00020\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u009f\u0001\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00a0\u0001\u001a\u00020\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00a1\u0001\u001a\u00020\u001dX\u0082.\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00a2\u0001\u001a\u00020\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u00a3\u0001\u001a\u00030\u00a4\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00a5\u0001\u0010\u00a6\u0001\"\u0006\b\u00a7\u0001\u0010\u00a8\u0001\u00a8\u0006\u00b8\u0002"}, d2 = {"Lcom/lam2000/base_module/view/ShadowView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "", "backgroundAlpha", "getBackgroundAlpha", "()F", "setBackgroundAlpha", "(F)V", "backgroundColorType", "Lcom/lam2000/base_module/view/ShadowView$ColorType;", "getBackgroundColorType", "()Lcom/lam2000/base_module/view/ShadowView$ColorType;", "setBackgroundColorType", "(Lcom/lam2000/base_module/view/ShadowView$ColorType;)V", "backgroundPaint", "Landroid/graphics/Paint;", "backgroundPath", "Landroid/graphics/Path;", "backgroundPathRadius", "", "backgroundPathRadiusUpdated", "", "backgroundType", "Lcom/lam2000/base_module/view/ShadowView$BackgroundType;", "getBackgroundType", "()Lcom/lam2000/base_module/view/ShadowView$BackgroundType;", "setBackgroundType", "(Lcom/lam2000/base_module/view/ShadowView$BackgroundType;)V", "bgColor", "getBgColor", "()I", "setBgColor", "(I)V", "bgGradientAngle", "getBgGradientAngle", "setBgGradientAngle", "bgGradientColors", "", "getBgGradientColors", "()[I", "setBgGradientColors", "([I)V", "bgGradientColorsXml", "bgGradientOffCenterX", "getBgGradientOffCenterX", "setBgGradientOffCenterX", "bgGradientOffCenterY", "getBgGradientOffCenterY", "setBgGradientOffCenterY", "cornerRadiusBottomLeft", "getCornerRadiusBottomLeft", "setCornerRadiusBottomLeft", "cornerRadiusBottomRight", "getCornerRadiusBottomRight", "setCornerRadiusBottomRight", "cornerRadiusTopLeft", "getCornerRadiusTopLeft", "setCornerRadiusTopLeft", "cornerRadiusTopRight", "getCornerRadiusTopRight", "setCornerRadiusTopRight", "Lcom/lam2000/base_module/view/ShadowView$CornerType;", "cornerType", "getCornerType", "()Lcom/lam2000/base_module/view/ShadowView$CornerType;", "setCornerType", "(Lcom/lam2000/base_module/view/ShadowView$CornerType;)V", "cornersRadius", "getCornersRadius", "setCornersRadius", "defaultShadowArea", "defaultStrokeDashSize", "defaultStrokeGapSize", "noStrokePath", "onTouchedAnimate", "getOnTouchedAnimate", "()Z", "setOnTouchedAnimate", "(Z)V", "onTouchedDuration", "", "getOnTouchedDuration", "()J", "setOnTouchedDuration", "(J)V", "onTouchedStyle", "getOnTouchedStyle", "setOnTouchedStyle", "shadow", "Lcom/lam2000/base_module/view/ShadowView$ShadowObject;", "shadowBottom", "getShadowBottom", "setShadowBottom", "shadowDy", "getShadowDy", "setShadowDy", "shadowLeft", "getShadowLeft", "setShadowLeft", "shadowMaskError", "shadowRight", "getShadowRight", "setShadowRight", "shadowSpace", "getShadowSpace", "setShadowSpace", "shadowTop", "getShadowTop", "setShadowTop", "strWidth", "getStrWidth", "setStrWidth", "strokeAlpha", "getStrokeAlpha", "setStrokeAlpha", "strokeCapType", "Lcom/lam2000/base_module/view/ShadowView$CapType;", "getStrokeCapType", "()Lcom/lam2000/base_module/view/ShadowView$CapType;", "setStrokeCapType", "(Lcom/lam2000/base_module/view/ShadowView$CapType;)V", "strokeColor", "getStrokeColor", "setStrokeColor", "strokeColorType", "getStrokeColorType", "setStrokeColorType", "strokeDashSize", "getStrokeDashSize", "setStrokeDashSize", "strokeGapSize", "getStrokeGapSize", "setStrokeGapSize", "strokeGradientAngle", "getStrokeGradientAngle", "setStrokeGradientAngle", "strokeGradientColors", "getStrokeGradientColors", "setStrokeGradientColors", "strokeGradientColorsXml", "strokeGradientOffCenterX", "getStrokeGradientOffCenterX", "setStrokeGradientOffCenterX", "strokeGradientOffCenterY", "getStrokeGradientOffCenterY", "setStrokeGradientOffCenterY", "strokeMask", "strokeMaskRadius", "strokeMaskRadiusUpdated", "strokePaint", "strokePath", "strokePathRadius", "strokePathRadiusUpdated", "strokeType", "Lcom/lam2000/base_module/view/ShadowView$StrokeType;", "getStrokeType", "()Lcom/lam2000/base_module/view/ShadowView$StrokeType;", "setStrokeType", "(Lcom/lam2000/base_module/view/ShadowView$StrokeType;)V", "addBackgroundRectF", "", "path", "addBackgroundShadowMaskRectF", "addBoundaryRectF", "addNoStrokeAreaRectF", "addStrokePath", "angleCheck", "angle", "angleToRadians", "", "assignColorAlpha", "color", "alpha", "boundaryCheck", "boundary", "canDrawBackground", "canDrawShadow", "canDrawStroke", "cornerUpdated", "determineCornerCircularAngle", "x", "y", "max", "dimenCheck", "dimen", "allowedDimen", "(FLjava/lang/Float;)F", "drawBackground", "canvas", "Landroid/graphics/Canvas;", "drawChild", "child", "Landroid/view/View;", "drawingTime", "drawShadow", "drawShadows", "drawStroke", "floatPercentCheck", "getActualHeight", "getActualWidth", "getBackgroundPaint", "getBackgroundPath", "getBackgroundPathRadius", "getCenterX", "offCenter", "getCenterY", "getColorArray", "colors", "getCornerRadius", "radius", "topLeft", "topRight", "bottomRight", "bottomLeft", "inset", "getDiameter", "getDx", "getDy", "getLinearGradientCircularStartPoint", "Lkotlin/Pair;", "getLinearShader", "Landroid/graphics/LinearGradient;", "colorArray", "getNoStrokePath", "getRadialShader", "Landroid/graphics/RadialGradient;", "offCenterX", "offCenterY", "getRectF", "Landroid/graphics/RectF;", "width", "height", "insetLeft", "insetTop", "insetRight", "insetBottom", "getShaderRadius", "getShadowArea", "getShadowShadowBottom", "getShadowShadowLeft", "getShadowShadowRight", "getShadowShadowTop", "getStrokeCap", "Landroid/graphics/Paint$Cap;", "capType", "getStrokeMask", "getStrokeMaskRadius", "getStrokePaint", "getStrokePath", "getStrokePathRadius", "getStrokeWidth", "getSweepShader", "Landroid/graphics/SweepGradient;", "haveAnyShadow", "haveShadow", "initBackgroundCornerRadius", "initBackgroundGradientColors", "initBackgroundPaint", "initBackgroundPath", "initLayerTypes", "paints", "", "([Landroid/graphics/Paint;)V", "initNoStrokePath", "initPadding", "initShadow", "initShadowArea", "initShadowMask", "initShadowPaint", "initShadowPath", "initStrokeGradientColors", "initStrokeMask", "initStrokeMaskRadius", "initStrokePaint", "initStrokePath", "initStrokePathRadius", "initialize", "isDashed", "mapAlphaTo1", "mapAlphaTo255", "onDraw", "setCorners", "cornerRadius_TopLeft", "cornerRadius_TopRight", "cornerRadius_BottomRight", "cornerRadius_BottomLeft", "cornerRadius", "setShadow", "blur", "distance", "setShadowAlpha", "setShadowAngle", "setShadowBlur", "setShadowColor", "setShadowDistance", "BackgroundType", "CapType", "ColorType", "Companion", "CornerType", "ShadowObject", "StrokeType", "base-module_debug"})
public class ShadowView extends android.widget.FrameLayout {
    private final float defaultShadowArea = 0.0F;
    private final float defaultStrokeDashSize = 0.0F;
    private final float defaultStrokeGapSize = 0.0F;
    private final float shadowMaskError = 0.5F;
    @org.jetbrains.annotations.NotNull()
    private com.lam2000.base_module.view.ShadowView.BackgroundType backgroundType;
    @org.jetbrains.annotations.NotNull()
    private com.lam2000.base_module.view.ShadowView.ColorType backgroundColorType;
    private int bgColor;
    private android.graphics.Paint backgroundPaint;
    private android.graphics.Path backgroundPath;
    private float backgroundAlpha = 1.0F;
    private float[] backgroundPathRadius;
    private boolean backgroundPathRadiusUpdated = false;
    private int[] bgGradientColorsXml;
    public int[] bgGradientColors;
    private float bgGradientAngle = 0.0F;
    private float bgGradientOffCenterX = 0.0F;
    private float bgGradientOffCenterY = 0.0F;
    @org.jetbrains.annotations.NotNull()
    private com.lam2000.base_module.view.ShadowView.StrokeType strokeType;
    @org.jetbrains.annotations.NotNull()
    private com.lam2000.base_module.view.ShadowView.ColorType strokeColorType;
    private int strokeColor;
    private android.graphics.Paint strokePaint;
    private android.graphics.Path strokeMask;
    private android.graphics.Path strokePath;
    private android.graphics.Path noStrokePath;
    private float strokeAlpha = 1.0F;
    private float[] strokeMaskRadius;
    private boolean strokeMaskRadiusUpdated = false;
    private float[] strokePathRadius;
    private boolean strokePathRadiusUpdated = false;
    private float strWidth = 0.0F;
    private float strokeDashSize;
    private float strokeGapSize;
    @org.jetbrains.annotations.NotNull()
    private com.lam2000.base_module.view.ShadowView.CapType strokeCapType;
    private int[] strokeGradientColorsXml;
    public int[] strokeGradientColors;
    private float strokeGradientAngle = 0.0F;
    private float strokeGradientOffCenterX = 0.0F;
    private float strokeGradientOffCenterY = 0.0F;
    private com.lam2000.base_module.view.ShadowView.ShadowObject shadow;
    private float shadowSpace = -1.0F;
    private float shadowLeft = -1.0F;
    private float shadowRight = -1.0F;
    private float shadowTop = -1.0F;
    private float shadowBottom = -1.0F;
    private float shadowDy = -1.0F;
    private float cornersRadius = 1.4E-45F;
    private float cornerRadiusTopLeft = 1.4E-45F;
    private float cornerRadiusTopRight = 1.4E-45F;
    private float cornerRadiusBottomLeft = 1.4E-45F;
    private float cornerRadiusBottomRight = 1.4E-45F;
    @org.jetbrains.annotations.NotNull()
    private com.lam2000.base_module.view.ShadowView.CornerType cornerType;
    private int onTouchedStyle = -1;
    private boolean onTouchedAnimate = false;
    private long onTouchedDuration = 400L;
    @org.jetbrains.annotations.NotNull()
    public static final com.lam2000.base_module.view.ShadowView.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.lam2000.base_module.view.ShadowView.ColorType DEFAULT_BACKGROUND_COLOR_TYPE = com.lam2000.base_module.view.ShadowView.ColorType.Solid;
    @org.jetbrains.annotations.NotNull()
    private static final com.lam2000.base_module.view.ShadowView.BackgroundType DEFAULT_BACKGROUND_TYPE = com.lam2000.base_module.view.ShadowView.BackgroundType.Fill;
    private static final int DEFAULT_COLOR_BACKGROUND = 0;
    private static final int DEFAULT_COLOR_STROKE = 0;
    public static final float DEFAULT_CORNER_RADIUS = 0.0F;
    @org.jetbrains.annotations.NotNull()
    private static final com.lam2000.base_module.view.ShadowView.CornerType DEFAULT_CORNER_TYPE = com.lam2000.base_module.view.ShadowView.CornerType.Custom;
    public static final float DEFAULT_OFF_CENTER_X = 0.0F;
    public static final float DEFAULT_OFF_CENTER_Y = 0.0F;
    private static final int DEFAULT_SHADOW_COLOR = 0;
    @org.jetbrains.annotations.NotNull()
    private static final com.lam2000.base_module.view.ShadowView.CapType DEFAULT_STROKE_CAP_TYPE = com.lam2000.base_module.view.ShadowView.CapType.Butt;
    @org.jetbrains.annotations.NotNull()
    private static final com.lam2000.base_module.view.ShadowView.ColorType DEFAULT_STROKE_COLOR_TYPE = com.lam2000.base_module.view.ShadowView.ColorType.Solid;
    public static final float DEFAULT_STROKE_SIZE = 0.0F;
    @org.jetbrains.annotations.NotNull()
    private static final com.lam2000.base_module.view.ShadowView.StrokeType DEFAULT_STROKE_TYPE = com.lam2000.base_module.view.ShadowView.StrokeType.Solid;
    public static final float NOT_DEFINED_ALPHA = 1.0F;
    public static final float NOT_DEFINED_ANGLE = 0.0F;
    public static final int NOT_DEFINED_COLOR = -10;
    public static final float NOT_DEFINED_CORNER_RADIUS = 1.4E-45F;
    public static final float NOT_DEFINED_DIMEN = -1.0F;
    public static final float NOT_DEFINED_SHADOW_SHADOW_AREA = -1.0F;
    public static final int NOT_DEFINED_STYLE = -1;
    public static final boolean NOT_DEFINED_ANIMATE = false;
    public static final long DEFAULT_DURATION = 400L;
    public static final float NOT_DEFINED_SHADOW_DX = -1.0F;
    public static final float NOT_DEFINED_SHADOW_DY = -1.0F;
    
    @org.jetbrains.annotations.NotNull()
    public final com.lam2000.base_module.view.ShadowView.BackgroundType getBackgroundType() {
        return null;
    }
    
    public final void setBackgroundType(@org.jetbrains.annotations.NotNull()
    com.lam2000.base_module.view.ShadowView.BackgroundType p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.lam2000.base_module.view.ShadowView.ColorType getBackgroundColorType() {
        return null;
    }
    
    public final void setBackgroundColorType(@org.jetbrains.annotations.NotNull()
    com.lam2000.base_module.view.ShadowView.ColorType p0) {
    }
    
    public final int getBgColor() {
        return 0;
    }
    
    public final void setBgColor(int p0) {
    }
    
    public final float getBackgroundAlpha() {
        return 0.0F;
    }
    
    public final void setBackgroundAlpha(float value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final int[] getBgGradientColors() {
        return null;
    }
    
    public final void setBgGradientColors(@org.jetbrains.annotations.NotNull()
    int[] p0) {
    }
    
    public final float getBgGradientAngle() {
        return 0.0F;
    }
    
    public final void setBgGradientAngle(float value) {
    }
    
    public final float getBgGradientOffCenterX() {
        return 0.0F;
    }
    
    public final void setBgGradientOffCenterX(float value) {
    }
    
    public final float getBgGradientOffCenterY() {
        return 0.0F;
    }
    
    public final void setBgGradientOffCenterY(float value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.lam2000.base_module.view.ShadowView.StrokeType getStrokeType() {
        return null;
    }
    
    public final void setStrokeType(@org.jetbrains.annotations.NotNull()
    com.lam2000.base_module.view.ShadowView.StrokeType p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.lam2000.base_module.view.ShadowView.ColorType getStrokeColorType() {
        return null;
    }
    
    public final void setStrokeColorType(@org.jetbrains.annotations.NotNull()
    com.lam2000.base_module.view.ShadowView.ColorType p0) {
    }
    
    public final int getStrokeColor() {
        return 0;
    }
    
    public final void setStrokeColor(int p0) {
    }
    
    public final float getStrokeAlpha() {
        return 0.0F;
    }
    
    public final void setStrokeAlpha(float value) {
    }
    
    public final float getStrWidth() {
        return 0.0F;
    }
    
    public final void setStrWidth(float value) {
    }
    
    public final float getStrokeDashSize() {
        return 0.0F;
    }
    
    public final void setStrokeDashSize(float value) {
    }
    
    public final float getStrokeGapSize() {
        return 0.0F;
    }
    
    public final void setStrokeGapSize(float value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.lam2000.base_module.view.ShadowView.CapType getStrokeCapType() {
        return null;
    }
    
    public final void setStrokeCapType(@org.jetbrains.annotations.NotNull()
    com.lam2000.base_module.view.ShadowView.CapType p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final int[] getStrokeGradientColors() {
        return null;
    }
    
    public final void setStrokeGradientColors(@org.jetbrains.annotations.NotNull()
    int[] p0) {
    }
    
    public final float getStrokeGradientAngle() {
        return 0.0F;
    }
    
    public final void setStrokeGradientAngle(float value) {
    }
    
    public final float getStrokeGradientOffCenterX() {
        return 0.0F;
    }
    
    public final void setStrokeGradientOffCenterX(float value) {
    }
    
    public final float getStrokeGradientOffCenterY() {
        return 0.0F;
    }
    
    public final void setStrokeGradientOffCenterY(float value) {
    }
    
    public final float getShadowSpace() {
        return 0.0F;
    }
    
    public final void setShadowSpace(float value) {
    }
    
    public final float getShadowLeft() {
        return 0.0F;
    }
    
    public final void setShadowLeft(float value) {
    }
    
    public final float getShadowRight() {
        return 0.0F;
    }
    
    public final void setShadowRight(float value) {
    }
    
    public final float getShadowTop() {
        return 0.0F;
    }
    
    public final void setShadowTop(float value) {
    }
    
    public final float getShadowBottom() {
        return 0.0F;
    }
    
    public final void setShadowBottom(float value) {
    }
    
    public final float getShadowDy() {
        return 0.0F;
    }
    
    public final void setShadowDy(float p0) {
    }
    
    public final float getCornersRadius() {
        return 0.0F;
    }
    
    public final void setCornersRadius(float value) {
    }
    
    public final float getCornerRadiusTopLeft() {
        return 0.0F;
    }
    
    public final void setCornerRadiusTopLeft(float value) {
    }
    
    public final float getCornerRadiusTopRight() {
        return 0.0F;
    }
    
    public final void setCornerRadiusTopRight(float value) {
    }
    
    public final float getCornerRadiusBottomLeft() {
        return 0.0F;
    }
    
    public final void setCornerRadiusBottomLeft(float value) {
    }
    
    public final float getCornerRadiusBottomRight() {
        return 0.0F;
    }
    
    public final void setCornerRadiusBottomRight(float value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.lam2000.base_module.view.ShadowView.CornerType getCornerType() {
        return null;
    }
    
    public final void setCornerType(@org.jetbrains.annotations.NotNull()
    com.lam2000.base_module.view.ShadowView.CornerType value) {
    }
    
    public final int getOnTouchedStyle() {
        return 0;
    }
    
    public final void setOnTouchedStyle(int p0) {
    }
    
    public final boolean getOnTouchedAnimate() {
        return false;
    }
    
    public final void setOnTouchedAnimate(boolean p0) {
    }
    
    public final long getOnTouchedDuration() {
        return 0L;
    }
    
    public final void setOnTouchedDuration(long p0) {
    }
    
    public ShadowView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public ShadowView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public ShadowView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    private final void initialize(android.content.Context context, android.util.AttributeSet attrs) {
    }
    
    private final void initShadowArea() {
    }
    
    private final void initPadding() {
    }
    
    private final void initLayerTypes(android.graphics.Paint... paints) {
    }
    
    private final void initShadow(com.lam2000.base_module.view.ShadowView.ShadowObject shadow) {
    }
    
    private final void initShadowPaint(com.lam2000.base_module.view.ShadowView.ShadowObject shadow) {
    }
    
    private final void initShadowPath(com.lam2000.base_module.view.ShadowView.ShadowObject shadow) {
    }
    
    private final void initShadowMask(com.lam2000.base_module.view.ShadowView.ShadowObject shadow) {
    }
    
    /**
     * Init background paint, style is fill.
     */
    private final void initBackgroundPaint() {
    }
    
    /**
     * Init stroke paint for dashed and non-dashed stroke path effect.
     * If path effect is dashed, style will be stroke else style will be fill and we will use mask.
     */
    private final void initStrokePaint() {
    }
    
    /**
     * Init stroke path radius (to be used in non-dashed style)
     */
    private final void initStrokeMaskRadius() {
    }
    
    /**
     * Init stroke path radius (to be used in dashed style)
     */
    private final void initStrokePathRadius() {
    }
    
    /**
     * Init background corner radius.
     */
    private final void initBackgroundCornerRadius() {
    }
    
    /**
     * Init background path
     * Adds background rectF.
     */
    private final void initBackgroundPath() {
    }
    
    /**
     * Init stroke path for dashed stroke style.
     * Adds stroke path rectF.
     */
    private final void initStrokePath() {
    }
    
    /**
     * Init stroke mask for non-dashed stroke style.
     * Adds background rectF and cuts it by no stroke rectF.
     */
    private final void initStrokeMask() {
    }
    
    /**
     * Init no stroke area path.
     * Will be used to clip children of this container.
     */
    private final void initNoStrokePath() {
    }
    
    /**
     * Assign alpha to background gradient colors
     */
    private final void initBackgroundGradientColors() {
    }
    
    /**
     * Assign alpha to stroke gradient colors
     */
    private final void initStrokeGradientColors() {
    }
    
    /**
     * Assign inset to corner radius
     * Positive inset will make corners less curve (because boundaries are smaller)
     * Negative inset will make corners more curve (because boundaries are larger)
     * Also check if individual corner radius is set.
     */
    private final float[] getCornerRadius(float radius, float topLeft, float topRight, float bottomRight, float bottomLeft, float inset) {
        return null;
    }
    
    /**
     * Normalize color array that is send from xml,
     * It will append color in series, for example if only colors of 3, 5, 6 is provided, it will map these color indexes, to 0, 1, 2.
     * It will append first color in array, if last color is not defined.
     * It will set default color values, if no colors are defined.
     */
    private final int[] getColorArray(int[] colors, float alpha) {
        return null;
    }
    
    /**
     * Assign alpha to color even if the color has its own alpha.
     * For example if the color has alpha of 0.5, assigning the alpha of 0.5 to it, will make the result color alpha to be 0.5 * 0.5 = 0.25
     */
    private final int assignColorAlpha(int color, float alpha) {
        return 0;
    }
    
    private final float getCornerRadius() {
        return 0.0F;
    }
    
    /**
     * Check dimen to be not negative.
     * Allowed dimen is used when we want dimen to be negative (For example, when we not set it)
     */
    private final float dimenCheck(float dimen, java.lang.Float allowedDimen) {
        return 0.0F;
    }
    
    /**
     * Helper function that calculates left, top, right, bottom values base on inputs and creates the RectF
     */
    private final android.graphics.RectF getRectF(float width, float height, float inset) {
        return null;
    }
    
    private final android.graphics.RectF getRectF(float width, float height, float insetLeft, float insetTop, float insetRight, float insetBottom) {
        return null;
    }
    
    /**
     * Create inset background path rectF
     */
    private final void addBackgroundRectF(android.graphics.Path path) {
    }
    
    /**
     * Shadow is drawn between actual boundary (view boundary) and the inset boundary.
     * So if we have stroke type background color, we don't want shadow to draw inside stroked path
     * (because path is a cut out path) so we need to mask shadow drawing to only draw outside inset boundary
     */
    private final void addBackgroundShadowMaskRectF(android.graphics.Path path) {
    }
    
    /**
     * This function is used when we have dashed type stroke. As the stroke type drawing, draws stroke on path.
     * So we need to create rectF smaller by half of stroke width.
     */
    private final void addStrokePath(android.graphics.Path path) {
    }
    
    /**
     * Adds cut out rectF that is not include any stroke inside.
     * This function will be used by stroke path initializer, and by inner shadow path initializer.
     * Both of these function, will use this rectF as cut out.
     */
    private final void addNoStrokeAreaRectF(android.graphics.Path path) {
    }
    
    /**
     * Adds boundary rectF without considering corner radius
     */
    private final void addBoundaryRectF(android.graphics.Path path) {
    }
    
    /**
     * Map angle to 0 - 360 range
     */
    private final float angleCheck(float angle) {
        return 0.0F;
    }
    
    /**
     * Checks if a float number is in 0 - 1 range and clamps it
     */
    private final float floatPercentCheck(float alpha) {
        return 0.0F;
    }
    
    /**
     * Maps alpha to 0 - 255 range
     */
    private final int mapAlphaTo255(float alpha) {
        return 0;
    }
    
    /**
     * Maps alpha to 0 - 1 range
     */
    private final float mapAlphaTo1(int alpha) {
        return 0.0F;
    }
    
    /**
     * Converts angle to radian
     */
    private final double angleToRadians(float angle) {
        return 0.0;
    }
    
    /**
     * Calculates dx base on angle and radius
     */
    private final float getDx(float radius, float angle) {
        return 0.0F;
    }
    
    /**
     * Calculates dy base on angle and radius
     */
    private final float getDy(float radius, float angle) {
        return 0.0F;
    }
    
    /**
     * Calculates diameter
     */
    private final float getDiameter(float x, float y) {
        return 0.0F;
    }
    
    /**
     * Checks if a value is outside of both positive and negative boundary
     */
    private final float boundaryCheck(float value, float boundary) {
        return 0.0F;
    }
    
    /**
     * Creates sweep shader
     */
    private final android.graphics.SweepGradient getSweepShader(int[] colorArray, float angle, float offCenterX, float offCenterY) {
        return null;
    }
    
    /**
     * Creates radial shader
     */
    private final android.graphics.RadialGradient getRadialShader(int[] colorArray, float offCenterX, float offCenterY) {
        return null;
    }
    
    /**
     * Calculate offCenter value of X axis base on multiplier
     */
    private final float getCenterX(float offCenter) {
        return 0.0F;
    }
    
    /**
     * Calculate offCenter value of Y axis base on multiplier
     */
    private final float getCenterY(float offCenter) {
        return 0.0F;
    }
    
    /**
     * Calculate how much radial shader radius must be, to fill out entire boundary
     */
    private final float getShaderRadius(float offCenterX, float offCenterY) {
        return 0.0F;
    }
    
    /**
     * Creating linear shader that start and end point is on path
     */
    private final android.graphics.LinearGradient getLinearShader(int[] colorArray, float angle) {
        return null;
    }
    
    /**
     * Calculate position of linear gradient starting point,with considering each corner radius of shape.
     * In this approach starting point of linear gradient,will fall on the path even on the curved corners.
     * So when we have multiple colors in linear gradient,no colors will fall outside of path when corner is curved.
     */
    private final kotlin.Pair<java.lang.Float, java.lang.Float> getLinearGradientCircularStartPoint(float angle) {
        return null;
    }
    
    /**
     * Determine how much we traverse corner to calculate angle
     * For example here we travel 5 unit in X axis, and there is 3 more left,
     * And we didn't travel on y axis. So {max} travel on each axis is 8.
     * And maximum travel angle is 90 degrees. and we traveled 5 + 0 / 8 + 8.
     * So angle is 5 / 16 * 90 = 28.125 degree.
     */
    private final float determineCornerCircularAngle(float x, float y, float max) {
        return 0.0F;
    }
    
    /**
     * Init background path radius and returns it
     */
    private final float[] getBackgroundPathRadius() {
        return null;
    }
    
    /**
     * Init stroke mask radius and returns it
     */
    private final float[] getStrokeMaskRadius() {
        return null;
    }
    
    /**
     * Init stroke path radius and returns it
     */
    private final float[] getStrokePathRadius() {
        return null;
    }
    
    /**
     * Adapter for converting capType to [Paint.Cap]
     */
    private final android.graphics.Paint.Cap getStrokeCap(com.lam2000.base_module.view.ShadowView.CapType capType) {
        return null;
    }
    
    /**
     * It's the trigger for corner related mathematics to update themselves according to new values.
     * It makes performance improvement to not calculate, if it is not changed.
     */
    private final void cornerUpdated() {
    }
    
    /**
     * Init stroke path and returns it
     */
    private final android.graphics.Path getStrokePath() {
        return null;
    }
    
    /**
     * Init stroke mask and returns it
     */
    private final android.graphics.Path getStrokeMask() {
        return null;
    }
    
    /**
     * Init stroke paint and returns it
     */
    private final android.graphics.Paint getStrokePaint() {
        return null;
    }
    
    /**
     * Init no stroke path and returns it
     */
    private final android.graphics.Path getNoStrokePath() {
        return null;
    }
    
    /**
     * If the stroke is dashed or not
     */
    private final boolean isDashed() {
        return false;
    }
    
    /**
     * Init background path and returns it
     */
    private final android.graphics.Path getBackgroundPath() {
        return null;
    }
    
    /**
     * Init background paint and returns it
     */
    private final android.graphics.Paint getBackgroundPaint() {
        return null;
    }
    
    /**
     * It returns 0 if can not draw stroke (because of background color type)
     */
    private final float getStrokeWidth() {
        return 0.0F;
    }
    
    /**
     * Returns default shadow area size if it is not set, or the actual shadow are it it is set.
     */
    private final float getShadowArea() {
        return 0.0F;
    }
    
    private final float getShadowShadowLeft() {
        return 0.0F;
    }
    
    private final float getShadowShadowTop() {
        return 0.0F;
    }
    
    private final float getShadowShadowRight() {
        return 0.0F;
    }
    
    private final float getShadowShadowBottom() {
        return 0.0F;
    }
    
    /**
     * Checks blur and sets it
     */
    public final void setShadowBlur(float blur) {
    }
    
    /**
     * Checks distance and sets it
     */
    public final void setShadowDistance(float distance) {
    }
    
    /**
     * Normalize alpha and sets it
     */
    public final void setShadowAlpha(float alpha) {
    }
    
    /**
     * It sets the color
     */
    public final void setShadowColor(int color) {
    }
    
    /**
     * Checks the angle and sets it
     */
    public final void setShadowAngle(float angle) {
    }
    
    public final void setShadow(float blur, float distance, float angle, float alpha, int color) {
    }
    
    public final void setCorners(float cornerRadius, float cornerRadius_TopLeft, float cornerRadius_TopRight, float cornerRadius_BottomRight, float cornerRadius_BottomLeft) {
    }
    
    public final void setCorners(float cornerRadius_TopLeft, float cornerRadius_TopRight, float cornerRadius_BottomRight, float cornerRadius_BottomLeft) {
    }
    
    public final boolean haveShadow() {
        return false;
    }
    
    public final boolean haveAnyShadow() {
        return false;
    }
    
    public final float getActualWidth() {
        return 0.0F;
    }
    
    public final float getActualHeight() {
        return 0.0F;
    }
    
    private final boolean canDrawBackground() {
        return false;
    }
    
    private final boolean canDrawStroke() {
        return false;
    }
    
    private final boolean canDrawShadow(com.lam2000.base_module.view.ShadowView.ShadowObject shadow) {
        return false;
    }
    
    private final void drawBackground(android.graphics.Canvas canvas) {
    }
    
    private final void drawStroke(android.graphics.Canvas canvas) {
    }
    
    private final void drawShadow(android.graphics.Canvas canvas, com.lam2000.base_module.view.ShadowView.ShadowObject shadow) {
    }
    
    private final void drawShadows(android.graphics.Canvas canvas) {
    }
    
    @java.lang.Override()
    protected void onDraw(@org.jetbrains.annotations.Nullable()
    android.graphics.Canvas canvas) {
    }
    
    @java.lang.Override()
    protected boolean drawChild(@org.jetbrains.annotations.Nullable()
    android.graphics.Canvas canvas, @org.jetbrains.annotations.Nullable()
    android.view.View child, long drawingTime) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/lam2000/base_module/view/ShadowView$BackgroundType;", "", "(Ljava/lang/String;I)V", "Fill", "Stroke", "FillStroke", "base-module_debug"})
    public static enum BackgroundType {
        /*public static final*/ Fill /* = new Fill() */,
        /*public static final*/ Stroke /* = new Stroke() */,
        /*public static final*/ FillStroke /* = new FillStroke() */;
        
        BackgroundType() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/lam2000/base_module/view/ShadowView$StrokeType;", "", "(Ljava/lang/String;I)V", "Solid", "Dash", "base-module_debug"})
    public static enum StrokeType {
        /*public static final*/ Solid /* = new Solid() */,
        /*public static final*/ Dash /* = new Dash() */;
        
        StrokeType() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/lam2000/base_module/view/ShadowView$ColorType;", "", "(Ljava/lang/String;I)V", "Solid", "GradientLinear", "GradientRadial", "GradientSweep", "base-module_debug"})
    public static enum ColorType {
        /*public static final*/ Solid /* = new Solid() */,
        /*public static final*/ GradientLinear /* = new GradientLinear() */,
        /*public static final*/ GradientRadial /* = new GradientRadial() */,
        /*public static final*/ GradientSweep /* = new GradientSweep() */;
        
        ColorType() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/lam2000/base_module/view/ShadowView$CapType;", "", "(Ljava/lang/String;I)V", "Square", "Butt", "Round", "base-module_debug"})
    public static enum CapType {
        /*public static final*/ Square /* = new Square() */,
        /*public static final*/ Butt /* = new Butt() */,
        /*public static final*/ Round /* = new Round() */;
        
        CapType() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lcom/lam2000/base_module/view/ShadowView$CornerType;", "", "(Ljava/lang/String;I)V", "Custom", "Rectangular", "Circular", "Third", "Quarter", "base-module_debug"})
    public static enum CornerType {
        /*public static final*/ Custom /* = new Custom() */,
        /*public static final*/ Rectangular /* = new Rectangular() */,
        /*public static final*/ Circular /* = new Circular() */,
        /*public static final*/ Third /* = new Third() */,
        /*public static final*/ Quarter /* = new Quarter() */;
        
        CornerType() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001b\"\u0004\b&\u0010\u001d\u00a8\u0006\'"}, d2 = {"Lcom/lam2000/base_module/view/ShadowView$ShadowObject;", "", "()V", "alpha", "", "getAlpha", "()F", "setAlpha", "(F)V", "angle", "getAngle", "setAngle", "blur", "getBlur", "setBlur", "color", "", "getColor", "()I", "setColor", "(I)V", "distance", "getDistance", "setDistance", "mask", "Landroid/graphics/Path;", "getMask", "()Landroid/graphics/Path;", "setMask", "(Landroid/graphics/Path;)V", "paint", "Landroid/graphics/Paint;", "getPaint", "()Landroid/graphics/Paint;", "setPaint", "(Landroid/graphics/Paint;)V", "path", "getPath", "setPath", "base-module_debug"})
    static final class ShadowObject {
        private int color;
        private float alpha = 1.0F;
        private float distance = -1.0F;
        private float blur = -1.0F;
        private float angle = 0.0F;
        @org.jetbrains.annotations.NotNull()
        private android.graphics.Paint paint;
        @org.jetbrains.annotations.NotNull()
        private android.graphics.Path path;
        @org.jetbrains.annotations.NotNull()
        private android.graphics.Path mask;
        
        public ShadowObject() {
            super();
        }
        
        public final int getColor() {
            return 0;
        }
        
        public final void setColor(int p0) {
        }
        
        public final float getAlpha() {
            return 0.0F;
        }
        
        public final void setAlpha(float p0) {
        }
        
        public final float getDistance() {
            return 0.0F;
        }
        
        public final void setDistance(float p0) {
        }
        
        public final float getBlur() {
            return 0.0F;
        }
        
        public final void setBlur(float p0) {
        }
        
        public final float getAngle() {
            return 0.0F;
        }
        
        public final void setAngle(float p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.graphics.Paint getPaint() {
            return null;
        }
        
        public final void setPaint(@org.jetbrains.annotations.NotNull()
        android.graphics.Paint p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.graphics.Path getPath() {
            return null;
        }
        
        public final void setPath(@org.jetbrains.annotations.NotNull()
        android.graphics.Path p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.graphics.Path getMask() {
            return null;
        }
        
        public final void setMask(@org.jetbrains.annotations.NotNull()
        android.graphics.Path p0) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\u0012X\u0086T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0012X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0012X\u0086T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u001b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u000eR\u0011\u0010\u001d\u001a\u00020\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0006R\u000e\u0010#\u001a\u00020\u0012X\u0086T\u00a2\u0006\u0002\n\u0000R\u0011\u0010$\u001a\u00020%\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u000e\u0010(\u001a\u00020\u0012X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0012X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\fX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0012X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0012X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0012X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0012X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0012X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\fX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u00063"}, d2 = {"Lcom/lam2000/base_module/view/ShadowView$Companion;", "", "()V", "DEFAULT_BACKGROUND_COLOR_TYPE", "Lcom/lam2000/base_module/view/ShadowView$ColorType;", "getDEFAULT_BACKGROUND_COLOR_TYPE", "()Lcom/lam2000/base_module/view/ShadowView$ColorType;", "DEFAULT_BACKGROUND_TYPE", "Lcom/lam2000/base_module/view/ShadowView$BackgroundType;", "getDEFAULT_BACKGROUND_TYPE", "()Lcom/lam2000/base_module/view/ShadowView$BackgroundType;", "DEFAULT_COLOR_BACKGROUND", "", "getDEFAULT_COLOR_BACKGROUND", "()I", "DEFAULT_COLOR_STROKE", "getDEFAULT_COLOR_STROKE", "DEFAULT_CORNER_RADIUS", "", "DEFAULT_CORNER_TYPE", "Lcom/lam2000/base_module/view/ShadowView$CornerType;", "getDEFAULT_CORNER_TYPE", "()Lcom/lam2000/base_module/view/ShadowView$CornerType;", "DEFAULT_DURATION", "", "DEFAULT_OFF_CENTER_X", "DEFAULT_OFF_CENTER_Y", "DEFAULT_SHADOW_COLOR", "getDEFAULT_SHADOW_COLOR", "DEFAULT_STROKE_CAP_TYPE", "Lcom/lam2000/base_module/view/ShadowView$CapType;", "getDEFAULT_STROKE_CAP_TYPE", "()Lcom/lam2000/base_module/view/ShadowView$CapType;", "DEFAULT_STROKE_COLOR_TYPE", "getDEFAULT_STROKE_COLOR_TYPE", "DEFAULT_STROKE_SIZE", "DEFAULT_STROKE_TYPE", "Lcom/lam2000/base_module/view/ShadowView$StrokeType;", "getDEFAULT_STROKE_TYPE", "()Lcom/lam2000/base_module/view/ShadowView$StrokeType;", "NOT_DEFINED_ALPHA", "NOT_DEFINED_ANGLE", "NOT_DEFINED_ANIMATE", "", "NOT_DEFINED_COLOR", "NOT_DEFINED_CORNER_RADIUS", "NOT_DEFINED_DIMEN", "NOT_DEFINED_SHADOW_DX", "NOT_DEFINED_SHADOW_DY", "NOT_DEFINED_SHADOW_SHADOW_AREA", "NOT_DEFINED_STYLE", "base-module_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lam2000.base_module.view.ShadowView.ColorType getDEFAULT_BACKGROUND_COLOR_TYPE() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lam2000.base_module.view.ShadowView.BackgroundType getDEFAULT_BACKGROUND_TYPE() {
            return null;
        }
        
        public final int getDEFAULT_COLOR_BACKGROUND() {
            return 0;
        }
        
        public final int getDEFAULT_COLOR_STROKE() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lam2000.base_module.view.ShadowView.CornerType getDEFAULT_CORNER_TYPE() {
            return null;
        }
        
        public final int getDEFAULT_SHADOW_COLOR() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lam2000.base_module.view.ShadowView.CapType getDEFAULT_STROKE_CAP_TYPE() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lam2000.base_module.view.ShadowView.ColorType getDEFAULT_STROKE_COLOR_TYPE() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lam2000.base_module.view.ShadowView.StrokeType getDEFAULT_STROKE_TYPE() {
            return null;
        }
    }
}